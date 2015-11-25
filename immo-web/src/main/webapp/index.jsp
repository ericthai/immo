<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>


	<!-- eric : modif local 6  --> 

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Immo</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/owl.carousel.css" rel="stylesheet" />
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/heroic-features.css" rel="stylesheet" />
    <link href="style/style.css" rel="stylesheet" />
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
	<script src="js/app.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	
	

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    <!-- Navigation -->
	<div class="container">
		<div id="sautLigne"></div>
		<div class="row"> 	 
			<div class="col-lg-3"><img src="images/logo.png" alt="Tigre" width="100%"></div>
			<div class="col-lg-9">&nbsp;</div>
		</div> 	 
		<div id="sautLigne"></div>
	</div>	
	
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="container1">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
				
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
					<li><a href="controleur/controleur.php">Accueil</a></li>
					<li><a href="#">Estimation</a></li>
					<li><a href="#">Achat</a></li>
					<li> <a href="controleur/controleur.php?action=signinup">Vente</a></li>
					<li><a href="#">Programme neuf</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-6">
				
				<div class="container-fluid gradient">
					<div id="sautLigne"></div>
					<div class="row text-center titreblocEstimation1"> 
						<font class="titreblocEstimation">Estimer gratuitement</font><br>la valeur de votre bien<br>
					</div>
					<div id="sautLigne"></div>
					<form class="form-horizontal">
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-3 blocEstimationLabel">Type de bien :</label>
							<div class="col-sm-9">
								<select class="form-control">
									<option value="one">One</option>
									<option value="two">Two</option>
									<option value="three">Three</option>
									<option value="four">Four</option>
									<option value="five">Five</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label for="inputEmail3" class="col-sm-3 blocEstimationLabel">Adresse :</label>
							<div class="col-sm-9">
								<input type="email" class="form-control" id="inputEmail3" placeholder="Adresse">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-3 blocEstimationLabel">Code postal :</label>
							<div class="col-sm-9">
								<input type="password" class="form-control" id="inputPassword3" placeholder="Password">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-3 blocEstimationLabel">Ville :</label>
							<div class="col-sm-9">
								<select class="form-control">
									<option value="one">-------------</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-8 col-sm-4">
								<button type="submit" class="btn btn-danger btn-block">Estimer mon bien</button>
							</div>
						</div>
					</form>

				</div>
            </div>
            <div class="col-lg-4 col-lg-offset-2">
                <h3>
                Later
<!-- 
					<c:set var="annonces" scope="request" value="${annonces}"/>
					<c:forEach var="annonce" items="${annonces}">
					    <h3>${annonce.description} ${annonce.etatCourant} </h3>
					</c:forEach>
 -->             
                </h3>
            </div>
        </div> 
	</div>
        <hr>

        <!-- Title -->
	<div class="container">
		<div class="container selection"> 
		
			<div class="row"> 	 
				<div class="col-lg-1">
					<a class="btn prev"><img src="images/btn_prev.png" alt="Tigre" width="30%" border="1"></a>	
				</div>
				<div class="col-lg-10">
					<div id="owl-demo" class="owl-carousel">
						<c:set var="annonces" scope="request" value="${annonces}"/>
						<c:forEach var="annonce" items="${annonces}">
							<div class="item thumbnail">
								<div class="titre">
									${annonce.getBienImmo().getAdresse().getVille()}
								</div>
								<div class="imgIadding">
									<img src="${annonce.getBienImmo().getPhotos().get(0).getNomFichier()}" alt="Tigre"  width="100%" height="120px">
								</div>
								<div class="prix">
									Prix : ${annonce.getBienImmo().getPrix()}
								</div>
								<div class="description">
									Détail...
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
				<div class="col-lg-1">
					<a class="btn next"><img src="images/btn_next.png" alt="Tigre" width="30%" border="1"></a>					
				</div>
			</div> 	
			<!--
			<div class="row">
				<div class="col-lg-2 col-lg-offset-4">					
					<a class="btn prev"><img src="images/btn_prev.png" alt="Tigre" width="30%" border="1"></a>	
				</div>
				<div class="col-lg-6">
					<a class="btn next"><img src="images/btn_next.png" alt="Tigre" width="30%" border="1"></a>					
				</div>	
			</div>
			-->	
			
		</div>	
	</div>	

    <hr>
		
    <div class="container">
        <div class="row">
            <div class="col-lg-8">
				
				<div class="container-fluid gradient">
					<div id="sautLigne"></div>
					<div class="row text-center titreblocEstimation1"> 
						<font class="titreblocEstimation">Acheter un bien avec Market Immo</font> 
					</div>
					<div id="sautLigne"></div>
					
					<form class="form-horizontal">
						<div class="row">
							<div class="col-xs-4 col-sm-4 col-md-4">
								<label for="inputEmail3" class="blocEstimationLabel">Type de bien :</label>
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<label for="inputEmail3" class="blocEstimationLabel">Localisation (Cp / Ville) :</label>
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<label for="inputEmail3" class="blocEstimationLabel">Nombre de piece(s) :</label>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-4 col-sm-4 col-md-4">
								<select class="form-control">
									<option value="one">One</option>
									<option value="two">Two</option>
									<option value="three">Three</option>
									<option value="four">Four</option>
									<option value="five">Five</option>
								</select>
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<input type="email" class="form-control" id="inputEmail3" placeholder="Adresse">
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<select class="form-control">
									<option value="one">One</option>
									<option value="two">Two</option>
									<option value="three">Three</option>
									<option value="four">Four</option>
									<option value="five">Five</option>
								</select>
							</div>
						</div>
						<div id="sautLigne"></div>
						<div class="row">
							<div class="col-xs-4 col-sm-4 col-md-4">
								<label for="inputEmail3" class="blocEstimationLabel">Surface Minimale :</label>
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<label for="inputEmail3" class="blocEstimationLabel">Budget Maximal :</label>
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<label for="inputEmail3" class="blocEstimationLabel">&nbsp;</label>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-4 col-sm-4 col-md-4">
								<select class="form-control">
									<option value="one">One</option>
									<option value="two">Two</option>
									<option value="three">Three</option>
									<option value="four">Four</option>
									<option value="five">Five</option>
								</select>
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<input type="email" class="form-control" id="inputEmail3" placeholder="Adresse">
							</div>
							<div class="col-xs-4 col-sm-4 col-md-4">
								<button type="submit" class="btn btn-danger btn-block">Rechercher</button>
							</div>
						</div>
					</form>
					<div id="sautLigne"></div>
					<div id="sautLigne"></div>
				</div>
            </div>
            <div class="col-lg-4">
				<div class="container-fluid gradient-gris">
					<div id="sautLigne"></div>
					<div class="row titreblocEstimation1">
						<div class="col-xs-3  col-sm-3 col-md-3">
							<img src="images/id_card.png" alt="" width="70%">
						</div>
						<div class="col-xs-9 col-sm-9 col-md-9">
							<font class="titreblocEstimation blue">Mon compte</font> 
						</div>
					</div>

					<div id="sautLigne"></div>
					
					<form class="form-horizontal">
						<div class="row">
							<div class="col-xs-6  col-sm-6 col-md-6">
								<label for="inputEmail3" class="blocEstimationLabel blue">Adresse email :</label>
							</div>
							<div class="col-xs-6  col-sm-6 col-md-6">
								<label for="inputEmail3" class="blocEstimationLabel blue">Mot de passe :</label>
							</div>
						</div>
						<div class="row">
							<div class="col-xs-6  col-sm-6 col-md-6">
								<input type="email" class="form-control" id="exampleInputEmail3" placeholder="Email">
							</div>
							<div class="col-xs-6  col-sm-6 col-md-6">
								<input type="password" class="form-control" id="exampleInputPassword3" placeholder="Password">
							</div>
						</div>
						<div id="sautLigne"></div>
						<div class="row">
							<div class="col-xs-6  col-sm-6 col-md-6">
								<label for="inputEmail3" class="blocEstimationLabel">&nbsp;</label>
							</div>
							<div class="col-xs-6  col-sm-6 col-md-6">
								<label for="inputEmail3" class="blocEstimationLabel">&nbsp;</label>
							</div>
						</div>
						<div class="row text-valign-top">
							<div class="col-xs-6  col-sm-6 col-md-6">
								<a href="mailto:#">Mot de passe oubliÃ©</a>
								<br>
								<a href="mailto:#">CrÃ©er un compte</a>
							</div>
							<div class="col-xs-6  col-sm-6 col-md-6">
								<button type="submit" class="btn btn-primary btn-block">Rechercher</button>
							</div>
						</div>
					</form>
					<div id="sautLigne"></div>
					<div id="sautLigne10"></div>
				</div>
            </div>
        </div> 
	</div>
        <hr>

        <!-- /.row -->

        <!-- Page Features -->
	<div class="container">
        <div class="row text-center">

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="http://placehold.it/800x500" alt="">
                    <div class="caption">
                        <h3>Feature Label</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                        <p>
                            <a href="#" class="btn btn-primary">Buy Now!</a> <a href="#" class="btn btn-default">More Info</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="http://placehold.it/800x500" alt="">
                    <div class="caption">
                        <h3>Feature Label</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                        <p>
                            <a href="#" class="btn btn-primary">Buy Now!</a> <a href="#" class="btn btn-default">More Info</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="http://placehold.it/800x500" alt="">
                    <div class="caption">
                        <h3>Feature Label</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                        <p>
                            <a href="#" class="btn btn-primary">Buy Now!</a> <a href="#" class="btn btn-default">More Info</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="http://placehold.it/800x500" alt="">
                    <div class="caption">
                        <h3>Feature Label</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
                        <p>
                            <a href="#" class="btn btn-primary">Buy Now!</a> <a href="#" class="btn btn-default">More Info</a>
                        </p>
                    </div>
                </div>
            </div>

        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </footer>
	</div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
