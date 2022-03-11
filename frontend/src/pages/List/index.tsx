import { useState, useContext, useEffect } from 'react';
import { api } from 'api/api';
import { MovieCard } from 'components/MovieCard';
import { Pagination } from 'components/Pagination';
import { Movie } from 'types/TypeMovie';
import { BASE_URL_API } from 'utils/constants';
import { MoviePage } from 'types/TypeMoviePage';

type ListPageMovieProps = {
  movies: Array<Movie>[];
};

const List: React.FC = () => {
  const [pageNumber, setPageNumber] = useState(0);

  useEffect(() => {
    api.get(`${BASE_URL_API}/movies?size=12&page=0`).then(resp => {
      const data = resp.data as MoviePage;
      console.log(data);

      setPageNumber(data.number);
    });
  }, []);

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
