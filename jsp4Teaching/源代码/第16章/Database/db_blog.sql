USE [db_blog]
GO
/****** Object:  Table [dbo].[tb_user]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_user](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[user_name] [varchar](50) NULL,
	[user_pswd] [varchar](20) NULL,
	[user_ico] [varchar](50) NULL,
	[user_motto] [varchar](50) NULL,
	[user_sex] [varchar](2) NULL,
	[user_oicq] [varchar](15) NULL,
	[user_email] [varchar](100) NULL,
	[user_from] [varchar](100) NULL,
	[user_blogName] [varchar](100) NULL,
	[user_ctTime] [datetime] NULL,
	[user_hitNum] [int] NULL,
 CONSTRAINT [PK_tb_user] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_user] ON
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (1, N'雨飞', N'456', N'myNull.jpg', N'稻草人在等待秋天', N'女', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'稻草人', CAST(0x0000A03B00A75008 AS DateTime), 49)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (2, N'许久', N'123', N'myNull.jpg', N'我是天空里的一片云', N'男', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'偶然', CAST(0x0000A03A00A67610 AS DateTime), 34)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (3, N'mr', N'mrsoft', N'myNull.jpg', N'明日科技', N'男', N'000000000', N'mingrisoft@mingrisoft.com', N'吉林省长春市', N'用今日的辛勤 换明日的回报', CAST(0x0000A03900A75F44 AS DateTime), 1635)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (5, N'莫明', N'123', N'myNull.jpg', N'莫了个明 奇了个妙', N'男', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'莫名其妙', CAST(0x0000A03800A58BB0 AS DateTime), 22)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (6, N'小糊涂仙', N'123', N'myNull.jpg', N'难得糊涂', N'男', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'难得糊涂', CAST(0x0000A03700A65090 AS DateTime), 130)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (8, N'英雄', N'123', N'myNull.jpg', N'出师未捷身先死 长使英雄泪满襟！！', N'男', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'信马游疆', CAST(0x0000A03500A7B4D0 AS DateTime), 71)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (9, N'猪小戒', N'123', N'myNull.jpg', N'脸皮薄，吃不着 脸皮厚，吃个够！', N'男', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'吃是最重要的', CAST(0x0000A03400A80CB4 AS DateTime), 89)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (10, N'童鑫', N'123', N'myNull.jpg', N'童心未免', N'女', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'童心未免', CAST(0x0000A03200AB24E4 AS DateTime), 12)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (11, N'海上星', N'123', N'myNull.jpg', N'数星星', N'男', N'10500646*', N'xujiu1@yahoo.com.cn', N'吉林省长春市', N'夜海星空', CAST(0x0000A02F00AA1888 AS DateTime), 163)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (27, N'无语', N'123456', N'userIco_06252012130840.jpg', N'bellflower', N'男', N'111111', N'wgh717@sohu.com', N'北方', N'风铃草的博客', CAST(0x0000A07B00D6B924 AS DateTime), 12)
INSERT [dbo].[tb_user] ([id], [user_name], [user_pswd], [user_ico], [user_motto], [user_sex], [user_oicq], [user_email], [user_from], [user_blogName], [user_ctTime], [user_hitNum]) VALUES (28, N'wgh', N'111', N'userIco_06252012130840.jpg', N'记忆的墙', N'女', N'111', N'wgh717@sohu.com', N'北方', N'wgh的博客', CAST(0x0000A07B00DA2230 AS DateTime), 6)
SET IDENTITY_INSERT [dbo].[tb_user] OFF
/****** Object:  Table [dbo].[tb_photo]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_photo](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[photo_whoId] [int] NULL,
	[photo_src] [varchar](200) NULL,
	[photo_info] [varchar](1000) NULL,
	[photo_uptime] [datetime] NULL,
 CONSTRAINT [PK_tb_photo] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_photo] ON
INSERT [dbo].[tb_photo] ([id], [photo_whoId], [photo_src], [photo_info], [photo_uptime]) VALUES (61, 3, N'06212012162903.jpg', N'牡丹花', CAST(0x0000A077010FA694 AS DateTime))
INSERT [dbo].[tb_photo] ([id], [photo_whoId], [photo_src], [photo_info], [photo_uptime]) VALUES (62, 27, N'06252012130649.jpg', N'独傲枝头', CAST(0x0000A07B00D81B0C AS DateTime))
SET IDENTITY_INSERT [dbo].[tb_photo] OFF
/****** Object:  Table [dbo].[tb_word]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_word](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[word_whoId] [int] NULL,
	[word_content] [varchar](2000) NULL,
	[word_author] [varchar](50) NULL,
	[word_time] [datetime] NULL,
 CONSTRAINT [PK_tb_word] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_word] ON
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (13, 3, N'43', N'摸名', CAST(0x0000A03E0160A5BC AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (14, 3, N'  安放的啊', N'摸名', CAST(0x0000A03E0160A6E8 AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (15, 3, N'发达上', N'摸名', CAST(0x0000A03E0160A814 AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (18, 3, N'发达十分大师傅', N'明日网友', CAST(0x0000A03F0102C618 AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (19, 3, N'犯得上', N'明日网友', CAST(0x0000A03F01030FEC AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (32, 5, N'生生世世', N'明日网友', CAST(0x0000A03F0109C83C AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (33, 3, N'发射点', N'明日网友', CAST(0x0000A03F010A2F5C AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (34, 3, N'发射点方法法', N'mr', CAST(0x0000A04101429E3C AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (35, 3, N'm', N'明日网友', CAST(0x0000A04A00DBB8D4 AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (37, 5, N'sdfdfdfd', N'lx', CAST(0x0000A04B010A8740 AS DateTime))
INSERT [dbo].[tb_word] ([id], [word_whoId], [word_content], [word_author], [word_time]) VALUES (38, 28, N'你好吗？', N'明日网友', CAST(0x0000A07B00DE6E94 AS DateTime))
SET IDENTITY_INSERT [dbo].[tb_word] OFF
/****** Object:  Table [dbo].[tb_article]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_article](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[art_whoId] [int] NULL,
	[art_title] [varchar](50) NULL,
	[art_content] [ntext] NULL,
	[art_pubTime] [datetime] NULL,
	[art_count] [int] NULL,
 CONSTRAINT [PK_tb_article] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_article] ON
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (1, 2, N'保护环境！爱护地球！', N'人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！', CAST(0x00009FF200CEA720 AS DateTime), 0)
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (2, 2, N'心中最向往的生活方式！', N'是衣来伸手、饭来张口；还是日出而作、日落而息？
是远离文明世界中的是是非非；还是继续追求昙花一显的那份虚荣？
每天都期待着发生什么，街上、商场、餐厅、公司和家里；
每天都在这种期待中一无所获的度过。
到今天，之前的每一天过的充实人们，
也许是为了实现他的目标、也许是想从这个世界找回点公平、也许是一种习惯。
满足你所有的要求，你会生存多久？
从今天，坚定一种信念，才会体会生存的意义！！
是衣来伸手、饭来张口；还是日出而作、日落而息？
是远离文明世界中的是是非非；还是继续追求昙花一显的那份虚荣？
每天都期待着发生什么，街上、商场、餐厅、公司和家里；
每天都在这种期待中一无所获的度过。
到今天，之前的每一天过的充实人们，
也许是为了实现他的目标、也许是想从这个世界找回点公平、也许是一种习惯。
满足你所有的要求，你会生存多久？
从今天，坚定一种信念，才会体会生存的意义！！', CAST(0x00009FF200CEA84C AS DateTime), 1)
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (3, 2, N'保护环境！爱护地球！', N'人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！', CAST(0x00009FF200CEA978 AS DateTime), 1)
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (4, 2, N'心中最向往的生活方式！', N'是衣来伸手、饭来张口；还是日出而作、日落而息？
是远离文明世界中的是是非非；还是继续追求昙花一显的那份虚荣？
每天都期待着发生什么，街上、商场、餐厅、公司和家里；
每天都在这种期待中一无所获的度过。
到今天，之前的每一天过的充实人们，
也许是为了实现他的目标、也许是想从这个世界找回点公平、也许是一种习惯。
满足你所有的要求，你会生存多久？
从今天，坚定一种信念，才会体会生存的意义！！
是衣来伸手、饭来张口；还是日出而作、日落而息？
是远离文明世界中的是是非非；还是继续追求昙花一显的那份虚荣？
每天都期待着发生什么，街上、商场、餐厅、公司和家里；
每天都在这种期待中一无所获的度过。
到今天，之前的每一天过的充实人们，
也许是为了实现他的目标、也许是想从这个世界找回点公平、也许是一种习惯。
满足你所有的要求，你会生存多久？
从今天，坚定一种信念，才会体会生存的意义！！', CAST(0x00009FF200CEAAA4 AS DateTime), 0)
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (5, 2, N'保护环境！爱护地球！', N'人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！', CAST(0x00009FF200CEABD0 AS DateTime), 3)
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (21, 3, N'保护环境！爱护地球！', N'人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！人类好 比瞬间流星
自然才是永远夜空。
当我们炫耀着不属于自己的光亮
一一坠落时,
请留下一片干净的天空！', CAST(0x0000A04A00E2A130 AS DateTime), 0)
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (22, 3, N'心中最向往的生活方式！', N'是衣来伸手、饭来张口；还是日出而作、日落而息？
是远离文明世界中的是是非非；还是继续追求昙花一显的那份虚荣？
每天都期待着发生什么，街上、商场、餐厅、公司和家里；
每天都在这种期待中一无所获的度过。
到今天，之前的每一天过的充实人们，
也许是为了实现他的目标、也许是想从这个世界找回点公平、也许是一种习惯。
满足你所有的要求，你会生存多久？
从今天，坚定一种信念，才会体会生存的意义！！
是衣来伸手、饭来张口；还是日出而作、日落而息？
是远离文明世界中的是是非非；还是继续追求昙花一显的那份虚荣？
每天都期待着发生什么，街上、商场、餐厅、公司和家里；
每天都在这种期待中一无所获的度过。
到今天，之前的每一天过的充实人们，
也许是为了实现他的目标、也许是想从这个世界找回点公平、也许是一种习惯。
满足你所有的要求，你会生存多久？
从今天，坚定一种信念，才会体会生存的意义！！', CAST(0x0000A04A00E31534 AS DateTime), 4)
INSERT [dbo].[tb_article] ([id], [art_whoId], [art_title], [art_content], [art_pubTime], [art_count]) VALUES (25, 3, N'心灵的宁静', N'面对着喧嚣的世界，心中渴求的是那份淡淡的宁静...
', CAST(0x0000A077010D1B04 AS DateTime), 1)
SET IDENTITY_INSERT [dbo].[tb_article] OFF
/****** Object:  Table [dbo].[tb_media]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_media](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[media_whoId] [int] NULL,
	[media_title] [varchar](100) NULL,
	[media_src] [varchar](100) NULL,
	[media_pic] [varchar](100) NULL,
	[media_info] [varchar](400) NULL,
	[media_uptime] [datetime] NULL,
	[media_lookCount] [int] NULL,
 CONSTRAINT [PK_tb_media] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_media] ON
INSERT [dbo].[tb_media] ([id], [media_whoId], [media_title], [media_src], [media_pic], [media_info], [media_uptime], [media_lookCount]) VALUES (101, 3, N'明日科技', N'06212012170031.flv', N'06212012170031.jpg', N'明日科技宣传视频', CAST(0x0000A07701184B14 AS DateTime), 2)
INSERT [dbo].[tb_media] ([id], [media_whoId], [media_title], [media_src], [media_pic], [media_info], [media_uptime], [media_lookCount]) VALUES (102, 27, N'明日科技编程词典', N'06252012200115.flv', N'06252012200115.jpg', N'明日科技数字出版先行者', CAST(0x0000A07B0149EEE4 AS DateTime), 0)
SET IDENTITY_INSERT [dbo].[tb_media] OFF
/****** Object:  Table [dbo].[tb_link]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_link](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[link_whoId] [int] NULL,
	[link_title] [varchar](100) NULL,
	[link_src] [varchar](200) NULL,
	[link_time] [datetime] NULL,
 CONSTRAINT [PK_tb_link] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_link] ON
INSERT [dbo].[tb_link] ([id], [link_whoId], [link_title], [link_src], [link_time]) VALUES (1, 1, N'fd', N'dsfd', CAST(0x00009A8B00CF4A04 AS DateTime))
INSERT [dbo].[tb_link] ([id], [link_whoId], [link_title], [link_src], [link_time]) VALUES (2, 1, N'fds', N'saf', CAST(0x00009A8B00CF4B30 AS DateTime))
INSERT [dbo].[tb_link] ([id], [link_whoId], [link_title], [link_src], [link_time]) VALUES (3, 1, N'fd', N'fdas', CAST(0x00009A8B00CF4C5C AS DateTime))
INSERT [dbo].[tb_link] ([id], [link_whoId], [link_title], [link_src], [link_time]) VALUES (4, 2, N'f', N'afd', CAST(0x00009A8B00CF4D88 AS DateTime))
INSERT [dbo].[tb_link] ([id], [link_whoId], [link_title], [link_src], [link_time]) VALUES (5, 2, N'ds', N'safsda', CAST(0x00009A8B00CF4EB4 AS DateTime))
INSERT [dbo].[tb_link] ([id], [link_whoId], [link_title], [link_src], [link_time]) VALUES (10, 3, N'明日科技图书网站', N'http://www.mingrisoft.com', CAST(0x00009A8B00CF5490 AS DateTime))
INSERT [dbo].[tb_link] ([id], [link_whoId], [link_title], [link_src], [link_time]) VALUES (16, 3, N'明日科技编程词典网', N'http://www.mrbccd.com', CAST(0x0000A07701192890 AS DateTime))
SET IDENTITY_INSERT [dbo].[tb_link] OFF
/****** Object:  Table [dbo].[tb_friend]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tb_friend](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[friend_whoId] [int] NULL,
	[user_id] [int] NULL,
 CONSTRAINT [PK_tb_friend] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[tb_friend] ON
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (1, 1, 3)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (2, 1, 8)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (3, 2, 3)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (4, 2, 11)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (5, 3, 1)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (6, 3, 2)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (10, 3, 5)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (19, 3, 9)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (22, 3, 11)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (23, 3, 8)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (24, 3, 6)
INSERT [dbo].[tb_friend] ([id], [friend_whoId], [user_id]) VALUES (25, 27, 3)
SET IDENTITY_INSERT [dbo].[tb_friend] OFF
/****** Object:  Table [dbo].[tb_elect]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_elect](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[elect_whoId] [int] NULL,
	[elect_title] [varchar](100) NULL,
	[elect_src] [varchar](300) NULL,
	[elect_time] [datetime] NULL,
 CONSTRAINT [PK_tb_elect] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_elect] ON
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (1, 1, N'dsd', N'http://192.168.1.16:8080/play01', CAST(0x00009A55017683C8 AS DateTime))
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (2, 1, N'f', N'http://192.168.1.16:8080/play03', CAST(0x00009A55017684F4 AS DateTime))
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (3, 1, N'fs', N'http://192.168.1.16:8080/play04', CAST(0x00009A5501768620 AS DateTime))
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (4, 2, N's', N'http://192.168.1.16:8080/play03', CAST(0x00009A550176874C AS DateTime))
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (5, 2, N'f', N'http://192.168.1.16:8080/play02', CAST(0x00009A5501768878 AS DateTime))
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (6, 3, N'保护环境，爱护地球！', N'http://192.168.1.16:8080/play06', CAST(0x00009A5501769B38 AS DateTime))
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (7, 3, N'心中最向往的生活方式！', N'http://192.168.1.16:8080/play05', CAST(0x00009A5501769688 AS DateTime))
INSERT [dbo].[tb_elect] ([id], [elect_whoId], [elect_title], [elect_src], [elect_time]) VALUES (29, 3, N'心灵的宁静', N'http://localhost:8080/blog/my/guest/article?action=singleShow&id=25', CAST(0x0000A077011AEA90 AS DateTime))
SET IDENTITY_INSERT [dbo].[tb_elect] OFF
/****** Object:  Table [dbo].[tb_articleR]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_articleR](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[artReview_rootId] [int] NULL,
	[artReview_author] [varchar](50) NULL,
	[artReview_content] [varchar](2000) NULL,
	[artReview_time] [datetime] NULL,
 CONSTRAINT [PK_tb_artReview] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[tb_articleR] ON
INSERT [dbo].[tb_articleR] ([id], [artReview_rootId], [artReview_author], [artReview_content], [artReview_time]) VALUES (79, 5, N'mr', N'抢个沙发', CAST(0x0000A077011A1EA8 AS DateTime))
SET IDENTITY_INSERT [dbo].[tb_articleR] OFF
/****** Object:  Table [dbo].[tb_mediaR]    Script Date: 06/25/2012 20:54:30 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tb_mediaR](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[mediaR_rootId] [int] NULL,
	[mediaR_author] [varchar](50) NULL,
	[mediaR_content] [ntext] NULL,
	[mediaR_time] [datetime] NULL,
 CONSTRAINT [PK_tb_mediaR] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Default [DF_tb_article_art_count]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_article] ADD  CONSTRAINT [DF_tb_article_art_count]  DEFAULT (0) FOR [art_count]
GO
/****** Object:  Default [DF_tb_media_media_pic]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_media] ADD  CONSTRAINT [DF_tb_media_media_pic]  DEFAULT ('null.jpg') FOR [media_pic]
GO
/****** Object:  Default [DF_tb_media_media_info]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_media] ADD  CONSTRAINT [DF_tb_media_media_info]  DEFAULT ('没有视频预览') FOR [media_info]
GO
/****** Object:  Default [DF_tb_media_media_lookCount]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_media] ADD  CONSTRAINT [DF_tb_media_media_lookCount]  DEFAULT (0) FOR [media_lookCount]
GO
/****** Object:  Default [DF_tb_user_user_ico]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_user] ADD  CONSTRAINT [DF_tb_user_user_ico]  DEFAULT ('myNull.jpg') FOR [user_ico]
GO
/****** Object:  Default [DF_tb_user_user_hitNum]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_user] ADD  CONSTRAINT [DF_tb_user_user_hitNum]  DEFAULT (0) FOR [user_hitNum]
GO
/****** Object:  ForeignKey [FK_tb_article_tb_user]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_article]  WITH CHECK ADD  CONSTRAINT [FK_tb_article_tb_user] FOREIGN KEY([art_whoId])
REFERENCES [dbo].[tb_user] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_article] CHECK CONSTRAINT [FK_tb_article_tb_user]
GO
/****** Object:  ForeignKey [FK_tb_articleR_tb_article]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_articleR]  WITH CHECK ADD  CONSTRAINT [FK_tb_articleR_tb_article] FOREIGN KEY([artReview_rootId])
REFERENCES [dbo].[tb_article] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_articleR] CHECK CONSTRAINT [FK_tb_articleR_tb_article]
GO
/****** Object:  ForeignKey [FK_tb_elect_tb_user]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_elect]  WITH CHECK ADD  CONSTRAINT [FK_tb_elect_tb_user] FOREIGN KEY([elect_whoId])
REFERENCES [dbo].[tb_user] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_elect] CHECK CONSTRAINT [FK_tb_elect_tb_user]
GO
/****** Object:  ForeignKey [FK_tb_friend_tb_user]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_friend]  WITH CHECK ADD  CONSTRAINT [FK_tb_friend_tb_user] FOREIGN KEY([user_id])
REFERENCES [dbo].[tb_user] ([id])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[tb_friend] CHECK CONSTRAINT [FK_tb_friend_tb_user]
GO
/****** Object:  ForeignKey [FK_tb_link_tb_user]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_link]  WITH CHECK ADD  CONSTRAINT [FK_tb_link_tb_user] FOREIGN KEY([link_whoId])
REFERENCES [dbo].[tb_user] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_link] CHECK CONSTRAINT [FK_tb_link_tb_user]
GO
/****** Object:  ForeignKey [FK_tb_media_tb_user]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_media]  WITH CHECK ADD  CONSTRAINT [FK_tb_media_tb_user] FOREIGN KEY([media_whoId])
REFERENCES [dbo].[tb_user] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_media] CHECK CONSTRAINT [FK_tb_media_tb_user]
GO
/****** Object:  ForeignKey [FK_tb_mediaR_tb_media]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_mediaR]  WITH CHECK ADD  CONSTRAINT [FK_tb_mediaR_tb_media] FOREIGN KEY([mediaR_rootId])
REFERENCES [dbo].[tb_media] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_mediaR] CHECK CONSTRAINT [FK_tb_mediaR_tb_media]
GO
/****** Object:  ForeignKey [FK_tb_photo_tb_user]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_photo]  WITH CHECK ADD  CONSTRAINT [FK_tb_photo_tb_user] FOREIGN KEY([photo_whoId])
REFERENCES [dbo].[tb_user] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_photo] CHECK CONSTRAINT [FK_tb_photo_tb_user]
GO
/****** Object:  ForeignKey [FK_tb_word_tb_user]    Script Date: 06/25/2012 20:54:30 ******/
ALTER TABLE [dbo].[tb_word]  WITH CHECK ADD  CONSTRAINT [FK_tb_word_tb_user] FOREIGN KEY([word_whoId])
REFERENCES [dbo].[tb_user] ([id])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[tb_word] CHECK CONSTRAINT [FK_tb_word_tb_user]
GO
