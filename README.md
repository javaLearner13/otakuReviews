<div align=center>
  
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ
<br>
<br>
  
**:heart:OtakuReviews:heart:**<br>
*<sub>this is where you will shine, mr.otaku.:kiss:</sub>*<br>
<br>
๐ธ
<br>
ํฌํธํด๋ฆฌ์ค ๊ฐ๋ฐ๋ธํธ 2023 3์<br>
  TEAM: ๐ฅ**์ํ์ฐ**
  ***The Queen***:crown:
<br>
๊ฐ๋ฐ์ธ์: 3๋ช:family_man_man_girl:<br>
๋ชฉํ: JSP, MySQL, SERVLET, MVC Pattern์ ๊ธฐ๋ฐ์ผ๋กํ ์ปคํผ ๋ฑ ์ํ์ ๊ดํ ๋ฆฌ๋ทฐ ์น ๊ตฌ์ถ<br>
<br>
๊ตฌ์ฑ<br>
1.<์> ํ์๊ฐ์ (๋ฐ์ดํฐ์ฐ๋)<br>
2.<์> ๋ก๊ทธ์ธ(๋ฐ์ดํฐ์ฐ๋, validation)<br>
3.<์> ๋ฆฌ๋ทฐํ์ด์ง(product ๋ฆฌ๋ทฐ ๋ฑ๋ก)<br>
4.๋ง์ดํ์ด์ง(์ ๋ณด ํ์ธ, ์์  ๊ฐ๋ฅ ์ธ ๋ฆฌ๋ทฐ ๋ด์ญ ์ดํด๋ณด๊ธฐ)<br>
5.<์> ๊ด๋ฆฌ์ admin ๋ก๊ทธ์ธ ๊ตฌํ ๋ฐ ๊ด๋ฆฌ์์ฉ jsp ํ์ด์ง ๊ตฌํ (๋ชจ๋  ๋ฆฌ๋ทฐ, ์ ์  ๋ฆฌ์คํธ)<br>
6.<์> session ๋ฐ์ธ๋ฉ ๋ก๊ทธ์ธ ๋ก๊ทธ์์ ๊ตฌํ<br>
7.(์์ ) ๊ด๋ฆฌ์ ํ์ด์ง ๋ฆฌ๋ทฐ, ์ ์ ์ ๋ณด ์์  ์ถ๊ฐ ์ญ์  ๊ตฌํ<br>
8.<์งํ์ค> product๋ณ ๋ฆฌ๋ทฐ ์์ธํ์ด์ง<br>
<br>
![Alt Text](https://media.giphy.com/media/3o7TKDcovELwB2DM64/giphy.gif)<br>
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ<br>
<br>
servlet nav guide<br>
  ~~/register (ํ์๊ฐ์ ํ๋ฉด)<br>~~
  ~~/login.jsp (๋ก๊ทธ์ธ ํ๋ฉด)<br>~~
  **start the server from portfolio package itself then you'll be welcomed by "index.html" where you can navigate to other jsp files.**<br>
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ<br>
<br>
JSP, JSTL, JDBC, MVC, SERVLET, ECLIPSE, MYSQL...<br>
portfolio[jsp_data main]<br>
com.portfolio.registration.<br>
//used com.mysql.cj.jdbc.Driver, not com.mysql.jdbc.Driver (depends on connector version)<br>
//portfolio - build path - class module<br>
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ<br>
<br>
0.๋ผ์ด๋ธ๋ฌ๋ฆฌ: (webapp - WEB-INF - lib)<br>
<br>
--03.07<br>
//added jsp api 2.2<br>
//added jstl 1.2<br>
//added mysql connector<br>
//added servlet api<br>
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ<br>
<br>
1.MVC (Model-View-Controller) ํจํด<br>
<br>
<MVC์ user ๋ฑ๋ก ์์คํ ๊ตฌ์ถ><br>
--03.07<br>
//added model, dao, controller packages<br>
//added User.java (JavaBean)<br>
//added UserDAO.java (DAO)<br>
//added UserServlet.java (Servlet)<br>
//added userRegistration.jsp under views<br>
//added userInfo.jsp under views<br>
--03.08<br>
--03.09<br>
//added user info display (request.getParameter //๋ด์ฅ๊ฐ์ฒด ์ฌ์ฉ) to userInfo.jsp<br>
<br>
<MVC์ user ๋ก๊ทธ์ธ&๊ฒ์ฆ ์์คํ ๊ตฌ์ถ><br>
--03.07<br>
//added UserLogin.java (JavaBean)<br>
//added LoginDAO.java (DAO)<br>
--03.08<br>
//added LoginServlet.java (Servlet)<br>
//added login.jsp<br>
//added welcome.jsp<br>
//added alert feature to LoginServlet.java (in case login validation fails)<br>
--03.12~13<br>
//updated LoginServlet.java<br>
//added Logout Servlet<br>
//added session login and logout<br>
//added admin login system<br>
<br>
--03.13<br>
//deleted index.html
//added index.jsp
//completed login session binding system
//edited index.jsp so that some features are hidden for signed-in users such as "ํ์๊ฐ์" and "๋ก๊ทธ์ธ"
<MVC์ product review ๋ฑ๋ก ์์คํ ๊ตฌ์ถ><br>
--03.10<br>
//added Product.java (JavaBean)<br>
//added ProductServlet.java (Servlet)<br>
//added ProductDAO.java (DAO)<br>
--03.14<br>
//edit logout servlet<br>
<br>
<MVC์ product review ๋ฆฌ์คํธ ์์คํ ๊ตฌ์ถ><br>
--03.10<br>
//temporarily added packages for review model, review servlet, review dao<br>
--03.12<br>
//added MVC for review sql and jsp<br>
//added jstl libraries and statements in review.jsp (review.jsp working as intended and userInfo.jsp will replace review.jsp to list only review items that belong to the signed-in user<br>
--03.13<br>
//added admin jsp page where all products and user information are displayed<br>
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ<br>
<br>
2.MySQL<br>
(query file name: forPortfolio)<br>
<br>
<user ๋ฑ๋ก sql><br>
--03.07<br>
//added user table (id: auto_increment)<br>
//added phone to user table<br>
//now using user table for both login and registration<br>
<br>
<user ๋ก๊ทธ์ธ sql><br>
--03.07<br>
//added login table<br>
--03.08<br>
//deleted login table<br>
--03.10<br>
//added table for brand (subject to changes)<br>
//added table for review (subject to changes)<br>
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ<br>
<br>
3. ๊ธฐํ<br>
<br>
--03.09<br>
//added main.jsp (๋ฉ์ธํ์ด์ง๋ก ์ฌ์ฉ ์์ )<br>
--03.10<br>
//removed main.jsp<br>
//added index.html (replacing main.jsp)<br>
--03.11<br>
//changed MySQL password to "Tkfkdgo450." Thus, updated DAO files as well.<br>
--03.12<br>
//added jstl core and jstl sql library and statements in review.jsp<br>
--03.13<br>
//updated css<br>
--03.14<br>
//added images folder<br>
<br>
๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ๐ธ<br>
<br>
</div>
