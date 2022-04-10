<?php
    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "mydb";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    $q = "drop database deletedb";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("cannot fire query".mysqli_error($conn));
    }
    echo "done";

    mysqli_close($conn);
?>