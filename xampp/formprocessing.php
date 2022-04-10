<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Processing</title>
</head>
<?php 
    if(isset($_GET["uname"]) && isset($_GET["age"])) {
        print "Welcome ".$_GET["uname"];
        print ". You are ".$_GET["age"]." years old";
        $age = $_GET["age"];
        myref($age);
        print "<br><br> let's try pass by reference : ".$age;
        exit();
    }

    function myref(&$x) {
        $x -= 18;
    }

?>
<body>
    <form action="<?php $_PHP_SELF?>" method="get">
        Name : <input type="text" name="uname" id="uname"><br>
        Age : <input type="number" name="age" id="age"><br>
        <input type="submit" value="SUBMIT">
    </form>
</body>
</html>