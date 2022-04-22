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
            <h4>Lista użytkowników</h4>
            </div>
            <div class="table">
                <table>
                    <thead>
                    <tr class ="table-header">
                        <td>Id</td>
                        <td>Nazwa użytkownika</td>
                        <td>Email</td>
                        <td>Akcja</td>
                    </tr>
                    <c:forEach var="user" items="${userList}">
                        <tr>
                        <td>${user.id}</td>
                        <td>${user.userName}</td>
                        <td>${user.email}</td>
                        <td>
                            <form method="POST" action="<c:url value="/user/delete"/>" class="inline">
                                <input type="hidden" name="id" value="${user.id}">
                                <button type="submit" name="submit_param" value="submit_value" class="inline link-button">Usuń</button>
                            </form>
                            <form method="POST" action="<c:url value="/user/edit"/>" class="inline">
                                <input type="hidden" name="id" value="${user.id}">
                                <button type="submit" name="submit_param" value="submit_value" class="inline link-button">Edytuj</button>
                            </form>
                            <form method="POST" action="<c:url value="/user/show"/>" class="inline">
                                <input type="hidden" name="id" value="${user.id}">
                                <button type="submit" name="submit_param" value="submit_value" class="inline link-button">Pokaż</button>
                            </form>
                        </td>
                        </tr>
                    </c:forEach>
                    </thead>
                </table>
            </div>
    </div>
    <!-- /.container-fluid -->



<%@ include file="/footer.jsp" %>

