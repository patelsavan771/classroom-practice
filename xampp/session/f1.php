<?php 

session_start();
    if(isset($_GET["username"]) && isset($_GET["password"])) {
        print "on f1";
        $uname = $_GET["username"];
        $pass = $_GET["password"];
       if(strcmp($uname,$pass) == 0 && strcmp($uname,"admin") == 0) {
           
           $_SESSION["ww"] = $uname;

           header("location:f2.php");
       }
       else {
        header("location:first.html");
       }
    }

?>