import axios from "axios"
const query = axios.create()

query.defaults.baseURL = "http://localhost:9001"

export default query;