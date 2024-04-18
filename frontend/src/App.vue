<script >
import Employee from './components/Employee.vue';

export default{
  name: 'App',
  components:{
    Employee
  }
}
</script>

<template>
  <div id = "app">
      <Employee/>
  </div>
</template>

<style>
#app {
  background-size: cover;
  background-position: center;
  background-attachment: fixed;
  background-color: aliceblue;
  position: fixed;
  top: 0;
  left: 0; 
  width: 100vw;
  height: 100vh;
  display: flex;
  z-index: 1; 
}
#app .table td, #app .table th{
  color: black; 
}
 
</style>
