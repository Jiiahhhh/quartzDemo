<!DOCTYPE html>
<html>
<head>
    <title>View Update Demo</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> <!-- Tambahkan jQuery -->
</head>
<body>
<h1>Quartz View Update Demo</h1>
<p id="message">Message: Loading...</p>
<p id="lastUpdated">Last Updated: Loading...</p>

<script>
    function fetchData() {
        $.ajax({
            url: "/view/fetchData", // URL untuk endpoint fetchData
            method: "GET",
            success: function(data) {
                $("#message").text("Message: " + data.message);
                $("#lastUpdated").text("Last Updated: " + data.lastUpdated);
            },
            error: function() {
                console.error("Failed to fetch data");
            }
        });
    }

    // Jalankan fetchData setiap 5 detik
    setInterval(fetchData, 5000);

    // Panggil pertama kali saat halaman dimuat
    fetchData();
</script>
</body>
</html>
