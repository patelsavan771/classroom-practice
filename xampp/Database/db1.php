<?php
    $bdhost = "localhost";
    $user = "root";
    $pass = "";

    $conn = mysqli_connect($bdhost, $user, $pass, "mydb");

    if(!$conn) {
        die("Cannot connect to DB.".mysqli_error($conn));
    }
    echo "connected successful";

    $q = "create table student (id int, name varchar(30), age int)";

    $ret = mysqli_query($conn, $q);
    if(!$ret) {
        die("Cannot fire query.".mysqli_error($conn));
    }
    echo "<br>query successful";

    mysqli_close($conn);

?>