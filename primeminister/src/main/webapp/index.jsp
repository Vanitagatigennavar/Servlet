<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CREATING THE JAVA SERVER PAGE</h1>
<form action="modi" method="post">
NAME<input type="text" id="nm" name="name">
<br>
<br>
COUNTRY:<br>
<Select name="COUNTRY NAME" id="cn">
<option>------AllCountryNames------</option>
<option value="India">INDIA</option>
<option value="Australia">AUSTRAILIA</option>
<option value="SHRILANKA">SHRILANKA</option>
<option value="ZOMBIA">ZOMBIA</option>
<option value="AMERICA">AMERICA</option>
</Select>
<br>
<br>
MARRIAGE STATUS:
<br>
<input type="radio" id="married" name="MARRIED">MARRIED</input>
<input type="radio" id="unmarried" name="UNMARRIED">UNMARRIED</input>
<br>
<br>
PARTY :
<br>
<select name="PARTY">
<option>----PARTY NAMES-----</option>
<option value="BJP">BJP</option>
<option value="CONGRESS">CONGRESS</option>
<option value="JDS">JDS</option>
<option value="JANASENA">JANASENA</option>
<option value="KJP">KJP</option>
</select>
<br>
<br>
AGE:<br>
<input type="text" id="age" name="AGE">
<br>
<br>
GENDER :<br>
<input type="radio" id="gend" name="FEMALE">FEMALE</input>
<input type="radio" id="gend" name="MALE">MALE</input>
<input type="radio" id="gend" name="TRANSGENDER">TRANSGENDER</input>
<br>
<br>
PERIOD AS :<br><input type="text" id="txt" name="YEARS">
<br>
<br>
TIMES REPRESENTED :<br> 
<select name="TIMES">
<option>-----SELECT-----</option>
<option value="2 times">2 TIMES</option> 
<option value="3 times">3 TIMES</option> 
<option value="7 times">7 TIMES</option> 
<option value="10 times">10 TIMES</option>
</select>
<br>
<br>
<br>
<input type="submit" value="SAVE">
</form>


</body>
</html>