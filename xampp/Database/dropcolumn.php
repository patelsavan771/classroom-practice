<?php
    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "mydb";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    if(!$conn) {
        die("cannot connect to db");
    }

    $q = "alter table demo drop column lastname";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("error");
    }
    echo "done";
?>