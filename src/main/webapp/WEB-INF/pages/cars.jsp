<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="Cars">
    <h1>Cars</h1>
    <form method="POST" action="${pageContext.request.contextPath}/Cars">
        <a href="${pageContext.request.contextPath}/AddCar" class="btn btn-primary btn-lg">Add Car</a>
        <button class="btn btn-danger" type="submit">Delete Cars</button>
        <div class="container text-center">
            <c:forEach var="carInfo" items="${cars}">
                <div class="row">
                    <div class="col">
                        <input type="checkbox" name="car_ids" value="${carInfo.id}" />
                    </div>
                    <div class="col">
                            ${carInfo.licensePlate}
                    </div>
                    <div class="col">
                            ${carInfo.parkingSpot}
                    </div>
                    <div class="col">
                            ${carInfo.ownerName}
                        <a class="btn btn-secondary" href="${pageContext.request.contextPath}/EditCar?id=${carInfo.id}">Edit Car</a>
                    </div>
                </div>
            </c:forEach>
        </div>
    </form>
    <h5>Free parking spots: ${numberOfFreeParkingSpots}</h5>
</t:pageTemplate>