import axios from 'axios';

const api = axios.create({
  baseURL: 'https://i9a407.p.ssafy.io/api'
  // baseURL: 'http://localhost:8080/'
});

export default api;
