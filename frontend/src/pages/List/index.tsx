import { useState, useEffect } from 'react';
import { http } from 'app/http/';
import { MovieCard } from 'components/MovieCard';
import { Pagination } from 'components/Pagination';
import { BASE_URL_API } from 'app/utils/constants';
import { TypeMoviePage } from 'app/types/TypeMoviePage';

const List: React.FC = () => {
  const [pageNumber, setPageNumber] = useState(0);
  const [page, setSetPage] = useState<TypeMoviePage>({
    content: [],
    last: true,
    totalPages: 0,
    totalElements: 0,
    size: 12,
    number: 0,
    first: true,
    numberOfElements: 0,
    empty: true
  });

  useEffect(() => {
    http
      .get(`${BASE_URL_API}/movies?size=12&page=${pageNumber}&sort=id`)
      .then(resp => {
        const data = resp.data as TypeMoviePage;
        setSetPage(data);
      });
  }, [pageNumber]);

  return (
    <div className='container'>
      <Pagination />
      <div className='row'>
        {page.content.map(movie => {
          return (
            <div key={movie.id} className='col-sm col-lg-4 col-xl-3'>
              <MovieCard movie={movie} />
            </div>
          );
        })}
      </div>
    </div>
  );
};

export { List };
