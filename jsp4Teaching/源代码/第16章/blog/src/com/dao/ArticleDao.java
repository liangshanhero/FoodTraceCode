package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.toolsBean.Change;
import com.toolsBean.DB;
import com.valueBean.ArticleSingle;

public class ArticleDao extends SuperDao{
	/**
	 * @功能：获取在个人主页中显示的文章
	 */
	public List getDefaultArticle(int id) throws SQLException{
		String sql="select top 4 * from tb_article where art_whoId=? order by art_pubTime desc";
		Object[] params={id};		
		List articlelist=getList(sql,params);		
		return articlelist;
	}
	/**
	 * @功能：获取当前页显示的所有文章
	 */
	public List<ArticleSingle> getListArticle(int id,String showPage,String goWhich) throws SQLException{
		String sqlall="select * from tb_article where art_whoId=?";	//
		Object[] params={id};	//设置参数
		
		setPerR(5);
		createPage(sqlall,params,showPage,goWhich);	//初始化分页信息

		int currentP=getPage().getCurrentP();	//获取当前页数
		int top1=getPage().getPerR();	//获取每页显示的记录数
		int top2=(currentP-1)*top1;	//计算上一页已经获取到哪条记录
		String sql="";
		if(currentP<=1){	//获取第一页要显示的数据
			sql="SELECT TOP "+top1+" * FROM tb_article WHERE art_whoid=? ORDER BY art_pubtime DESC";
		}else{	//获取除第一页以外的每页要显示的数据
			sql="SELECT TOP "+top1+" * FROM tb_article i WHERE (art_whoId = ?) AND (art_pubTime < (SELECT MIN(art_pubTime) FROM (SELECT TOP "+top2+" * FROM tb_article WHERE art_whoId = i.art_whoId ORDER BY art_pubTime DESC) AS minv)) ORDER BY art_pubTime DESC";
		}
		List<ArticleSingle> articlelist=getList(sql,params);	//调用getList()方法从数据库中查询所需数据
		return articlelist;
	}
	/**
	 * @功能：获取文章详细内容
	 */	
	public ArticleSingle getSingleArticle(int id) throws SQLException{
		String sql="select * from tb_article where id=?";
		Object[] params={id};
		
		List<ArticleSingle> list=getList(sql,params);
		if(list!=null&&list.size()!=0)
			return (ArticleSingle)list.get(0);
		else
			return null;
	}
private List<ArticleSingle> getList(String sql,Object[] params) throws SQLException{
	List<ArticleSingle> list=null;		//声明一个用于保存文章信息的List集合
	DB mydb=new DB();	//创建数据库连接
	//根据SQL语句从数据库中查询所需的文章
	mydb.doPstm(sql,params);
	ResultSet rs=mydb.getRs();
	if(rs!=null){
		list=new ArrayList<>();//实例化一个List集合对象
		while(rs.next()){
			ArticleSingle single=new ArticleSingle();
			single.setId(rs.getInt(1));		//获取文章ID
			single.setArtWhoId(rs.getInt(2));	//获取所属用户
			single.setArtTitle(rs.getString(3));	//获取文章标题
			single.setArtContent(rs.getString(4));//获取文章内容
			single.setArtPubTime(Change.dateTimeChange(rs.getTimestamp(5)));	//获取发表时间
			single.setArtCount(rs.getInt(6));	//获取访问总数
			single.setRevCount(getRevCount(single.getId()));	//获取评论数
			list.add(single);
		}
		rs.close();	//关闭记录集
	}
	mydb.closed();	//关闭数据库连接
	return list;
}
	/**
	 * @throws SQLException 
	 * @功能：获取文章评论数
	 */
	private int getRevCount(int id) throws SQLException{
		int count=0;
		String sql="select count(id) from tb_articleR where artReview_rootId=?";
		Object[] params={id};
		
		DB mydb=new DB();
		mydb.doPstm(sql, params);
		ResultSet rs = mydb.getRs();
		if(rs!=null&&rs.next())
			count=rs.getInt(1);
		rs.close();
		mydb.closed();
		return count;
	}
	/**
	 * @功能：累加文章访问次数
	 */
	public void setArtCount(int id) throws SQLException{
		String sql="update tb_article set art_count=art_count+1 where id=?";
		Object[] params={id};
		DB mydb=new DB();
		mydb.doPstm(sql, params);
		mydb.closed();
	}
	/**
	 * @throws SQLException 
	 * @功能：修改文章
	 */
	public int modify(Object[] params) throws SQLException{
		String sql="update tb_article set art_title=?,art_content=? where id=?";
		DB mydb=new DB();
		mydb.doPstm(sql, params);
		int i=mydb.getCount();
		mydb.closed();
		return i;
	}
	/**
	 * @throws SQLException 
	 * @功能：删除文章
	 */
	public int delete(int id) throws SQLException{
		String sql="delete from tb_article where id=?";
		DB mydb=new DB();
		mydb.doPstm(sql, new Object[]{id});
		int i=mydb.getCount();
		mydb.closed();
		return i;
	}
	/**
	 * @throws SQLException 
	 * @功能：发表文章
	 */
	public int insert(Object[] params) throws SQLException{
		String sql="insert into tb_article values(?,?,?,?,?)";
		DB mydb=new DB();
		mydb.doPstm(sql,params);
		int i=mydb.getCount();
		mydb.closed();
		return i;
	}
}
