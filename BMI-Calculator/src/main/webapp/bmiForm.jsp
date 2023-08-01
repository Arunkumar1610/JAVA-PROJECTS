<head>
    <title>BMI Calculator</title>

    <style>

* {
    font-family: Quicksand;
    font-size: 16px;
    color: #333;
}
body {
    margin: 0;
    height: 100vh;
    padding: 0;
    border: 0;
    background: linear-gradient(to bottom right,  #fcfafa,#f8f5f6);
}
.form {
    background-color: #fff;
    height: 240px;
    width: 450px;
    border-radius: 20px;
    margin: 20px auto 20px auto;
    display: block;
    border: solid 1px #28f666;
    box-shadow: 0 0 40px 0 #ddd;
}
.form:hover {
    box-shadow: 0 0 60px 0 #ccc;
    transition: 0.4s;
    transform: scale(1.02);
}
.row-one {
    padding: 20px;
}
.row-two {
    padding: 20px;
}
.text-input {
    width: 60px;
    height: 30px;
    border-radius: 10px;
    background-color: #cbfdda;
    border: none;
    outline: none;
    padding: 5px 10px;
    cursor: pointer;
}
.text-input:last-child {
    margin-bottom: 35px;
}
.text-input:hover {
    background-color: #cbfdda;
}
#submit {
    border: auto;
    border-radius: 10px;
    height: 40px;
    width: 140px;
    background-color: #fff;
    color: #28f666;
    border-color: #28f666;
    margin: auto;
    display: block;
    
    cursor: pointer;
}
#submit:hover {
    background-color: #28f666;
    color: #fff;
}
.text {
    display: inline-block;
    margin: 5px 20px 5px 8px;
}
.row-one {
    padding: 30px 20px 15px 20px;
}
.row-two {
    padding: 15px 20px 30px 20px;
}
.container {
    display: inline-block;
    position: relative;
    padding-left: 30px;
    cursor: pointer;
    user-select: none;
}
.container input {
    position: absolute;
    opacity: 0;
}
.checkmark {
    position: absolute;
    top: 0;
    left: 0;
    height: 25px;
    width: 25px;
    background-color: #cbfdda;
    border-radius: 50%;
}
.container:hover input ~ .checkmark {
    background-color: #cbfdda;
}
.container input:checked ~ .checkmark {
    background-color: #28f666;
}
h1 {
    font-size: 30px;
    font-weight: 300;
    text-align: center;
    color: #28f666;
    padding-top: 15px;
    display: block;
}
h2 {
    font-size: 22px;
    font-weight: 300;
    text-align: center;
}
h3 {
    font-size: 24px;
    font-weight: 300;
    text-align: center;
    padding: 15px;
}
h3 b {
    font-size: 32px;
    font-weight: 300;
    color: #28f666;
}
.checkmark:after {
    content: "";
    position: absolute;
    display: none;
}
.container input:checked ~ .checkmark:after {
    display: block;
}
.container .checkmark:after {
    left: 9px;
    top: 5px;
    width: 5px;
    height: 10px;
    border: solid white;
    border-width: 0 2px 2px 0;
    transform: rotate(45deg);
}

    </style>
  </head>
  <body>
    <h3><b>B</b>ody <b>M</b>ass <b>I</b>ndex Calculator</h3>
  <form class="form" action="/calculate" method="post">
  <div class="row-one">
    
    <input type="text" class="text-input" id="age" autocomplete="off" required/><p class="text">Age</p>
    <label class="container">
    <input type="radio" name="radio" id="f"><p class="text">Female</p>
      <span class="checkmark"></span>
    </label>
    <label class="container">
    <input type="radio" name="radio" id="m"><p class="text">Male</p>
      <span class="checkmark"></span>
    </label>
    </div>
  
  <div class="row-two">
  <input type="text" class="text-input" id="height" name="height" autocomplete="off" required><p class="text">Height (cm)</p>
  <input type="text" class="text-input" id="weight" name="weight" autocomplete="off" required><p class="text">Weight (kg)</p>
  </div>
 
  <button type="submit" id="submit">Submit</button>

  </form>


  </body>
  </html>