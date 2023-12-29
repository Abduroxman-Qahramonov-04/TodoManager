<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
              <title>Manage your todos</title>
              <meta name="description" content="find home remodelling contractors and design ideas" />
              <meta name="keywords" content="Carpenter,Plumber,Interior designer,Architect,Electrician,Pest control,Movers and packers" />
              <meta name="author" content="metatags generator">
              <meta name="robots" content="index, follow" />
              <meta name="revisit-after" content="1 month" />
  <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
  <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
  <style>
    .father {
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
      background-color: #f1f1f1;
    }

    .welcome-container {
      width: 80%;
      max-width: 800px;
      margin: 50px auto;
      background-color: #fff;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      padding: 30px;
      text-align: center;
    }

    h1 {
      color: #333;
      margin-bottom: 20px;
    }

    p {
      color: #555;
      margin-bottom: 30px;
    }

    .btn {
      display: inline-block;
      padding: 10px 20px;
      background-color: #007bff;
      color: #fff;
      text-decoration: none;
      border-radius: 5px;
      transition: background-color 0.3s ease;
    }

    .btn:hover {
      background-color: #0056b3;
    }

    @media (max-width: 600px) {
      .welcome-container {
        padding: 20px;
      }

      h1 {
        font-size: 24px;
      }

      p {
        font-size: 14px;
      }
    }
  </style>
</head>
<body>
<%@ include file="common/navigation.jspf" %>
  <div class="father">
      <div class="welcome-container">
          <h1>Welcome! ${name}</h1>
          <p>This is a cool and responsive welcome page.</p>
          <a href="list-todos" class="btn">Menage Your TODOS</a>
        </div>
  </div>
</body>
</html>
