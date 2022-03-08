import { MovieCard } from 'components/MovieCard';
import { Pagination } from 'components/Pagination';

const List: React.FC = () => {
  return (
    <div>
      <Pagination />
      <MovieCard />
    </div>
  );
};

export { List };
