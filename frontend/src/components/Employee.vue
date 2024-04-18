<template>
    <div class = "container">
        <h1 class="text-center" style="color: black">Employee List</h1>
        <table class = "table table-striped">
                <thead>
                    <th>Employee Id</th>
                    <th>Employee First Name</th>
                    <th>Employee Last Name</th>
                    <th>Employee Email</th>
                </thead>
                <tbody>
                    <tr v-for = "employee in employees" v-bind:key="employee.id">
                    <td> {{ employee.id }}</td>
                    <td> {{ employee.firstName }}</td>
                    <td> {{ employee.lastName }}</td>
                    <td> {{ employee.email }}</td>
                    </tr>
                </tbody>
        </table>
    </div>
</template>

<script>
import EmployeeService from '@/services/EmployeeService';

    export default{
        name: 'Employees',
        data(){
            return{
                employees : []
            }
        },
        methods:{
            getEmployees(){
                EmployeeService.getEmployees().then((response)=>{
                    this.employees = response.data;
                });
            }

        },
        created(){
            this.getEmployees()
        }
    }
</script>

<style scoped>
.container {
  font-family: Arial, sans-serif;
  font-size: 16px;
  font-weight: normal;
  margin-top: 100px;
}
.table {
  width: 100%;
  border-collapse: collapse;
}

th, td {
  border: 1px solid black;
  padding: 8px;
  text-align: left;
}

thead th {
  background-color: #f2f2f2;
}

</style>


