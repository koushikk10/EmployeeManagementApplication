import axios from "axios";

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/v1/employees";
class EmployeeService{

//function, call this method from AddEmployee.js
saveEmployee(employee) {
    return axios.post(EMPLOYEE_API_BASE_URL, employee); //this will do the post request by taking employee object
}

}

export default new EmployeeService();