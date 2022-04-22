<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>
        <a href="<c:url value="/user/add"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Dodaj użytkownika</a>
    </div>

    <!-- Content Row -->

            <div>
            <h4>Szczegóły użytkownika</h4>
            </div>
            <div class="table">
                <table>
                    <thead>
                    <tr>
                        <td class ="table-header">Id</td>
                        <td>${user.id}</td>
                    </tr>
                    <tr>
                        <td class ="table-header">Nazwa użytkownika</td>
                        <td>${user.userName}</td>
                    </tr>
                    <tr>
                        <td class ="table-header">Email</td>
                        <td>${user.email}</td>
                    </tr>
                    </thead>
                </table>
                <br>
                <a href="<c:url value="/user/list"/>">Powrót do listy użytkowników</a>
            </div>
    </div>
    <!-- /.container-fluid -->



<%@ include file="/footer.jsp" %>

