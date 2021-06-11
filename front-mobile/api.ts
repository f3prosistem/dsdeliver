import axios from "axios";
 const API_URL ="https://f3pro-deliver.herokuapp.com";

 //const API_URL ="http://192.168.3.109:8080"

 export function fetchOrders(){
    return axios.get(`${API_URL}/orders`)
}

export function confirmDelivery(orderId:number){
    return axios.put(`${API_URL}/orders/${orderId}/delivered`)
}