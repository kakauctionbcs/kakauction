<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
$(function(){ 
		$("#myModal").css("display", "block");
	});
	$(".close").click(function() {
		$("#myModal").css("display", "none");
	});
});
</script>
<style type="text/css">
	.modal {
	    display: none; /* Hidden by default */
	    position: fixed; /* Stay in place */
	    z-index: 1; /* Sit on top */
	    padding-top: 100px; /* Location of the box */
	    left: 0;
	    top: 0;
	    width: 100%; /* Full width */
	    height: 100%; /* Full height */
	    overflow: auto; /* Enable scroll if needed */
	    background-color: rgb(0,0,0); /* Fallback color */
	    background-color: rgba(0,0,0,0.9); /* Black w/ opacity */
	}
	
	/* Modal Content (Image) */
	.modal-content {
	    margin: auto;
	    display: block;
	    width: 80%;
	    max-width: 700px;
	}
	
	/* Caption of Modal Image (Image Text) - Same Width as the Image */
	#caption {
	    margin: auto;
	    display: block;
	    width: 80%;
	    max-width: 700px;
	    text-align: center;
	    color: #ccc;
	    padding: 10px 0;
	    height: 150px;
	}
	
	/* Add Animation - Zoom in the Modal */
	.modal-content, #caption { 
	    -webkit-animation-name: zoom;
	    -webkit-animation-duration: 0.6s;
	    animation-name: zoom;
	    animation-duration: 0.6s;
	}
	
	/* The Close Button */
	.close {
	    position: absolute;
	    top: 15px;
	    right: 35px;
	    color: #f1f1f1;
	    font-size: 40px;
	    font-weight: bold;
	    transition: 0.3s;
	}
	
	.close:hover, .close:focus {
	    color: #bbb;
	    text-decoration: none;
	    cursor: pointer;
	}
	
    .modal-content {
        width: 100%;
    }
   @media only screen and (max-width: 700px){
    .modal-content {
        width: 100%;
    }
</style>
	<div id="myModal" class="modal">
		<span class="close">×</span>
			<iframe id="agreementframe" src="${pageContext.request.contextPath }/inc2/provision.html" 
			width="700px" height="300px"></iframe>
		<div id="caption"></div>
	</div>
