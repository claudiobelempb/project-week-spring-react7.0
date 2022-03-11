export const BASE_URL_API = process.env.NEXT_PRODUCTION
  ? process.env.NEXT_PRODUCTION
  : 'http://localhost:8080/api';
console.log('BASE_URL_API', BASE_URL_API);
// export const BASE_URL_PROD =
// process.env.API_URL ?? 'https://surb-sdmovie.herokuapp.com/api';
