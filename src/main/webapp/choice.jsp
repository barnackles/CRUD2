<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Dodaj użytkownika</a>
    </div>

    <!-- Content Row -->

    <div>
        <form action="<c:url value="/user/delete"/>" method="POST">
            <label>
                Czy na pewno chcesz usunąć tego użytkownika?
                <br>
                <input type="radio" name="choice" value="yes" />TAK
                <input type="radio" name="choice" value="no" checked="checked" /> NIE

            </label>
            <button type="submit">Potwierdź wybór</button>
            <input type="hidden" name="id" value="${id}">
        </form>

    </div>
    <!-- /.container-fluid -->



<%@ include file="/footer.jsp" %>

