import { api } from 'api/api';
import { MovieCard } from 'components/MovieCard';
import { Pagination } from 'components/Pagination';
import { BASE_URL_API } from 'utils/constants';

const List: React.FC = () => {
  api.get(`${BASE_URL_API}/movies?size=12&page=0`).then(resp => {
    console.log(resp.data);
  });

  return (
    <div className='container'>
      <Pagination />
      <div className='row'>
        <div className='col-sm col-lg-4 col-xl-3'>
          <MovieCard />
        </div>
        <div className='col-sm col-lg-4 col-xl-3'>
          <MovieCard />
        </div>
        <div className='col-sm col-lg-4 col-xl-3'>
          <MovieCard />
        </div>
        <div className='col-sm col-lg-4 col-xl-3'>
          <MovieCard />
        </div>
        <div className='col-sm col-lg-4 col-xl-3'>
          <MovieCard />
        </div>
        <div className='col-sm col-lg-4 col-xl-3'>
          <MovieCard />
        </div>
      </div>
    </div>
  );
};

export { List };
