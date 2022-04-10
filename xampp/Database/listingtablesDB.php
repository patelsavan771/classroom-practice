<?php
    $dbhost = "localhost";
    $user = "root";
    $pass = "";
    $dbname = "mydb";

    $conn = mysqli_connect($dbhost, $user, $pass, $dbname);

    $q = "show tables from $dbname";

    $ret = mysqli_query($conn, $q);

    if(!$ret) {
        die("cannot fire query".mysqli_error($conn));
    }
    
    while($r = mysqli_fetch_row($ret)) {
        print $r[0]."<br>";
    }

    mysqli_close($conn);
?>