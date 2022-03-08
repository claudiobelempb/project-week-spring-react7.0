import { MovieCard } from 'components/MovieCard';
import { Pagination } from 'components/Pagination';

const List: React.FC = () => {
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
