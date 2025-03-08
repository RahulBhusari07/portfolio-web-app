<!doctype html>
<%@page import="com.model.EducationModel"%>
<%@page import="com.model.ProjectFile"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.readDaoimpl"%>
<%@page import="com.dao.ReadDao"%>
<%@page errorPage="error.jsp"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Rahul Bhusari Portfolio</title>

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/unicons.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">

<!-- MAIN STYLE -->
<link rel="stylesheet" href="css/tooplate-style.css">

<!--

Tooplate 2115 Marvel

https://www.tooplate.com/view/2115-marvel

-->
</head>
<body>

	<!-- MENU -->
	<nav class="navbar navbar-expand-sm navbar-light">
		<div class="container">
			<a class="navbar-brand" href="index.html"><i class='uil uil-user'></i>Rahul
				Bhusari</a>

			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNav" aria-controls="navbarNav"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span> <span
					class="navbar-toggler-icon"></span> <span
					class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav mx-auto">
					<li class="nav-item"><a href="#about" class="nav-link"><span
							data-hover="About">About</span></a></li>
					<li class="nav-item"><a href="#project" class="nav-link"><span
							data-hover="Projects">Projects</span></a></li>
					<li class="nav-item"><a href="#resume" class="nav-link"><span
							data-hover="Resume">Resume</span></a></li>
					<li class="nav-item"><a href="#contact" class="nav-link"><span
							data-hover="Contact">Contact</span></a></li>
				</ul>

				<ul class="navbar-nav ml-lg-auto">
					<div class="ml-lg-4">
						<div
							class="color-mode d-lg-flex justify-content-center align-items-center">
							<i class="color-mode-icon"></i> Color mode
						</div>
					</div>
				</ul>
			</div>
		</div>
	</nav>



	<hr>
	<a href="admin.jsp" style="background-color: teal; margin-left: 150px"><button>ADMIN
			LOGIN</button></a>









	<%@include file="messageBox/printMessage.jsp"%>










	<!-- ABOUT -->
	<section
		class="about full-screen d-lg-flex justify-content-center align-items-center"
		id="about">
		<div class="container">
			<div class="row">

				<div class="col-lg-7 col-md-12 col-12 d-flex align-items-center">
					<div class="about-text">
						<small class="small-text">Welcome to <span
							class="mobile-block">my portfolio website!</span></small>
						<h1 class="animated animated-text">
							<span class="mr-2">Hey folks, I'm</span> <span
								class="animated-info"> <span class="animated-item">Rahul
									Bhusari</span> <span class="animated-item">SWE</span>
							</span>
						</h1>



						<p>I am a passionate and driven software engineer skilled in
							developing robust applications using Java and modern frameworks
							like Spring Boot, with a strong focus on delivering impactful
							solutions.</p>

						<div class="custom-btn-group mt-4">
							<a href="DownloadResume"
								class="btn custom-btn custom-btn-bg custom-btn-link"><i
								class='uil uil-file-alt'></i> Download Resume</a>

						</div>
					</div>
				</div>

				<div class="col-lg-5 col-md-12 col-12">
					<div class="about-image svg">
						<img src="images/undraw/software engineer2.svg" class="img-fluid"
							alt="svg image">
					</div>
				</div>


			</div>
		</div>
	</section>

	<!-- PROJECTS -->
	<section class="project py-5" id="project">
		<div class="container">

			<div class="row">
				<div class="col-lg-11 text-center mx-auto col-12">

					<div class="col-lg-8 mx-auto">
						<h2>LIST OF PROJECTS</h2>
					</div>


					<div class="owl-carousel owl-theme">

						<%
                      ReadDao  readDao = new readDaoimpl();
                      List<ProjectFile> list= readDao.readProjectData();
                      for(ProjectFile  projectFile :list)
                      {
                     
                     
                     %>




						<div class="item">
							<div class="project-info">
								<img src="myproject/<%=projectFile.getFilename()%>"
									class="img-fluid" alt="project image">
							</div>
						</div>
						<%} %>








					</div>
				</div>

			</div>
		</div>
		</div>
	</section>

	<!-- FEATURES -->
	<section
		class="resume py-5 d-lg-flex justify-content-center align-items-center"
		id="resume">
		<div class="container">
			<div class="row">

				<div class="col-lg-6 col-12">
					<h2 class="mb-4">Experiences</h2>

					<div class="timeline">
						<div class="timeline-wrapper">
							<div class="timeline-yr">
								<span>2024</span>
							</div>
							<div class="timeline-info">
								<h3>
									<span>Academic Counselor</span><small>Vedantu</small>
								</h3>
								<p>Worked as an intern with a dynamic team of sales
									professionals, introducing and showcasing Vedantu’s WAVE 2.0
									technology to students and parents, effectively communicating
									its value to improve learning experiences.</p>
							</div>
						</div>

						<div class="timeline-wrapper">
							<div class="timeline-yr">
								<span>2024</span>
							</div>
							<div class="timeline-info">
								<h3>
									<span>AI Associate</span><small>Amazon</small>
								</h3>
								<p>Monitored videos of the stowing actions at a fulfillment
									center, utilizing human judgment and tools to accurately
									annotate product locations. This process ensured high levels of
									accuracy and helped maintain the stow quality within the
									fulfillment center.</p>
							</div>
						</div>





					</div>
				</div>


				<div class="col-lg-6 col-12">
					<h2 class="mb-4 mobile-mt-2">Educations</h2>


					<div class="timeline">
<%-- 						<%
    ReadDao readDaoimpl = new readDaoimpl();
    List<EducationModel> educationData = readDaoimpl.readEducationData();
    for (EducationModel educationModel : educationData) {
%>
						<div class="timeline-wrapper">
							<div class="timeline-yr">
								<span><%= educationModel.getYear() %></span>
							</div>
							<div class="timeline-info">
								<h3>
									<span><%= educationModel.getTitle() %></span><small><%= educationModel.getSubtitle() %></small>
								</h3>
								<p><%= educationModel.getDescription() %></p>
							</div>
						</div>
						<% } %> --%>
						
						
						<%
    ReadDao readDaoimpl = new readDaoimpl();
    List<EducationModel> educationData = readDaoimpl.readEducationData();

    System.out.println("Data fetched: " + educationData.size()); // Debugging

    if (educationData.isEmpty()) {
%>
        <p>No education data available.</p>
<%
    }

    for (EducationModel educationModel : educationData) {
%>
        <div class="timeline-wrapper">
            <div class="timeline-yr">
                <span><%= educationModel.getYear() %></span>
            </div>
            <div class="timeline-info">
                <h3>
                    <span><%= educationModel.getTitle() %></span>
                    <small><%= educationModel.getSubtitle() %></small>
                </h3>
                <p><%= educationModel.getDescription() %></p>
            </div>
        </div>
<% } %>
						

					</div>
				</div>

			</div>
		</div>
	</section>

	<!-- CONTACT -->
	<section class="contact py-5" id="contact">
		<div class="container">
			<div class="row">

				<div class="col-lg-5 mr-lg-5 col-12">
					<div class="google-map w-100">
						<iframe
							src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d59783.37883515824!2d76.14534851843389!3d20.52830326820861!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bda1df8cd6d9cb1%3A0x5f36a09324f0bb4d!2sBuldhana%2C%20Maharashtra%20443001!5e0!3m2!1sen!2sin!4v1734690878068!5m2!1sen!2sin"
							width="400" height="300" frameborder="0" style="border: 0"
							allowfullscreen></iframe>
					</div>

					<div
						class="contact-info d-flex justify-content-between align-items-center py-4 px-lg-5">
						<div class="contact-info-item">
							<h3 class="mb-3 text-white">Say Hello</h3>
							<p class="footer-text mb-0">+91-8596364563</p>
							<p>
								<a href="mailto:hello@company.co">AlexMartin7020@gmail</a>
							</p>
						</div>

						<ul class="social-links">
							<li><a
								href="https://linkedin.com/in/rahul-bhusari-903925219"
								class="uil uil-dribbble" data-toggle="tooltip"
								data-placement="left" title="Linkedin"></a></li>
							<li><a href="https://github.com/RahulBhusari07"
								class="uil uil-instagram" data-toggle="tooltip"
								data-placement="left" title="Github"></a></li>

						</ul>
					</div>
				</div>























				<div class="col-lg-6 col-12">
					<div class="contact-form">
						<h2 class="mb-4">Interested to work together? Let's talk</h2>

						<form action="Contact" method="post">
							<div class="row">
								<div class="col-lg-6 col-12">
									<input type="text" class="form-control" name="name"
										placeholder="Your Name" id="name">
								</div>

								<div class="col-lg-6 col-12">
									<input type="email" class="form-control" name="email"
										placeholder="Email" id="email">
								</div>

								<div class="col-12">
									<textarea name="message" rows="6" class="form-control"
										id="message" placeholder="Message"></textarea>
								</div>

								<div class="ml-lg-auto col-lg-5 col-12">
									<input type="submit" class="form-control submit-btn"
										value="Send Button">
								</div>
							</div>
						</form>
					</div>
				</div>

			</div>
		</div>
	</section>

	<!-- FOOTER -->


	<footer class="footer py-5">
		<div class="container">
			<div class="row">

				<div class="col-lg-12 col-12">
					<p class="copyright-text text-center">Copyright &copy; 2025
						*RK* All rights reserved</p>

				</div>

			</div>
		</div>
	</footer>
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/Headroom.js"></script>
	<script src="js/jQuery.headroom.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/smoothscroll.js"></script>
	<script src="js/custom.js"></script>

</body>
</html>