
import axios from "axios";

const EMPLOYEE_APE_BASE_URL = 'http://localhost:8080/api/employee'


class EmployeeService{
    getEmployees(){
        return axios.get(EMPLOYEE_APE_BASE_URL);
    }
}
export default new EmployeeService();




