<?php 
    session_start();
    if(isset($_SESSION["ww"])) {
        print "welcome ".$_SESSION["ww"];
        print "<a href = 'f3.php'>logout</a>";
    }
    else {
        header("location:first.html");
    }

?>