import axios from 'axios';
import { BASE_URL_API } from 'app/utils/constants';

// const NEXT_PUBLIC = `${process.env.NEXT_PUBLIC}`;
// const NEXT_PRODUCTION = `${process.env.NEXT_PRODUCTION}`;
// console.log('NEXT_PUBLIC: ', NEXT_PUBLIC);
// console.log('NEXT_PRODUCTION: ', NEXT_PRODUCTION);
console.log(BASE_URL_API);

const api = axios.create({
  baseURL: `${process.env.BASE_URL_API}`
});

export { api };
