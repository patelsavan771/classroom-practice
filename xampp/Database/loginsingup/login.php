<?php

    $username = $_GET["username"];
    $password = $_GET["password"];

    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "test";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    if(!$conn) {
        die("DB error.".mysqli_error($conn));
    }
    // echo "Connected.";

    $q = "select * from log where uname = '".$username."' and pass ='".$password."'";
    // $q = "select * from login";

    $ret = mysqli_query($conn, $q);
    $db_pass = "";
    while($r = mysqli_fetch_assoc($ret)) {
        $r['uname'];
        $db_pass = $r['pass'];
    }

    if(strcmp($db_pass, $password) == 0) {
        print "great";
    }
    else {
        print "ops";
    }


?>