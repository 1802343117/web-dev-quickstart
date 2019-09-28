# quickstart起步模块
## 1.简单的登录
- login.html登录页面输入用户名和密码，通过表单发起请求
![Snipaste_2019-09-26_21-30-26.png](http://ww1.sinaimg.cn/large/0067OQVXgy1g7d8s9rooij30gg07vt8t.jpg)

- LoginServlet拦截到"/login.do"请求，判断用户名和密码是否匹配，是就将用户名记入session，跳转到index.jsp，否则继续跳回登录页
![Snipaste_2019-09-26_21-30-40.png](http://ww1.sinaimg.cn/large/0067OQVXgy1g7d8sq2wjdj30f304r74a.jpg)

- index.jsp首页根据session中是否有登录信息，来显示用户名或显示去登陆
![Snipaste_2019-09-26_21-31-00.png](http://ww1.sinaimg.cn/large/0067OQVXgy1g7d8sylkmuj30ex05ygln.jpg)


## 2.服务端转发数据至目标页面渲染
- Student实体类，封装基础属性
- StudentServlet，拦截/students请求，创建一个集合存入若干Student对象，存入request，并通过服务器转发（地址栏不变）将request带到student.jsp页面
- student.jsp页面用request内置对象取出数据，并借助页面内置对象和EL表达式,遍历数据集合，在页面上显示
![学生信息显示.jpg](http://ww1.sinaimg.cn/large/0067OQVXgy1g776q0du7qj31gu0lj40t.jpg)
