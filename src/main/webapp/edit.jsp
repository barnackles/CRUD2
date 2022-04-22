<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="<c:url value="/user/list"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Lista użytkowników</a>
    </div>

    <!-- Content Row -->

            <div>
            <h4>Edycja Użytkownika</h4>
            </div>
                <form action="<c:url value="/user/editdata"/>" method="POST">
                    <label>
                        Nazwa
                        <input type="text" name="userName"  placeholder="${user.userName}" >
                        <br>
                        Email
                        <input type="text" name="userEmail"  placeholder="${user.email}">
                        <br>
                        Hasło
                        <input type="password" name="userPassword"  placeholder="Hasło użytkownika">
                        <br>
                    </label>
                    <button type="submit">Edytuj</button>
                </form>
            </div>
    </div>
    <!-- /.container-fluid -->



<%@ include file="/footer.jsp" %>

