<?php
    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "mydb";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    if(!$conn) {
        die("cannot connect to db");
    }

    $q = "alter table demo add lname varchar(20)";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("error");
    }
    echo "done";
?>