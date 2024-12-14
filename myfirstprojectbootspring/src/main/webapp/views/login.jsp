<!DOCTYPE html>
<html lang="en">

<head>
  </head>
<body>
   <jsp:include page="header.jsp" />
<jsp:include page="navbar.jsp" />

   


  <div class="container-fluid bg-light overflow-hidden px-lg-0" style="margin: 6rem 0;">
        <div class="container contact px-lg-0">
            <div class="row g-0 mx-lg-0">
                <div class="col-lg-6 contact-text py-5 wow fadeIn" data-wow-delay="0.5s">
                    <div class="p-lg-5 ps-lg-0">
                        <div class="section-title text-start">
                            <h1 class="display-5 mb-4">USER LOGIN</h1>
                        </div>
                       
                        <form action="login" method="POST">
                            <div class="row g-3">
                               <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="text" class="form-control" name="unm" placeholder="Your username">
                                        <label for="unm">User Name</label>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-floating">
                                        <input type="password" class="form-control" name="pw" >
                                        <label for="pw">Password</label>
                                    </div>
                                </div>
                               
                                
                                   <input type="submit" value="Submit" />
                                
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-lg-6 pe-lg-0" style="min-height: 400px;">
                    <div class="position-relative h-100">
                        <iframe class="position-absolute w-100 h-100" style="object-fit: cover;"
                        src="https://www.google.com/search?q=shiva&sca_esv=578796015&hl=en&tbm=isch&source=hp&biw=1208&bih=616&ei=dJFDZdi3OtPn2roPp_qi-Ac&iflsig=AO6bgOgAAAAAZUOfhFa2QWFChvK01vsJp9yIf-0ANVwG&ved=0ahUKEwjYwfuRpKWCAxXTs1YBHSe9CH8Q4dUDCAc&uact=5&oq=shiva&gs_lp=EgNpbWciBXNoaXZhMggQABiABBixAzIIEAAYgAQYsQMyCBAAGIAEGLEDMggQABiABBixAzIIEAAYgAQYsQMyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMggQABiABBixA0i1CFAAWNQGcAB4AJABAJgBdqABvQSqAQMwLjW4AQPIAQD4AQGKAgtnd3Mtd2l6LWltZ8ICCBAAGLEDGIMBwgILEAAYgAQYsQMYgwE&sclient=img#imgrc=04snxG50fMTn_M"
                        frameborder="0" allowfullscreen="" aria-hidden="false"
                        tabindex="0"></iframe>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
<jsp:include page="footer.jsp" />
</body>

</html>