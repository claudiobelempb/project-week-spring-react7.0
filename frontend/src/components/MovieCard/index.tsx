import './styles.css';

import { MovieScore } from 'components/MovieScore';
import { Link } from 'react-router-dom';

const MovieCard: React.FC = () => {
  const movie = {
    id: 1,
    image:
      'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg',
    title: 'The Witcher',
    count: 2,
    score: 3.5
  };

  return (
    <div className='dsmovie-movie-card-container'>
      <img
        className='dsmovie-movie-card-image'
        src={movie.image}
        alt={movie.title}
      />
      <div className='dsmovie-card-bottom-container'>
        <h3 className='text-white fs-3'>{movie.title}</h3>
        <MovieScore score={movie.score} count={movie.count} />
        <Link to={`form/${movie.id}`}>
          <div className='btn btn-primary dsmovie-btn'>Avaliar</div>
        </Link>
      </div>
    </div>
  );
};

export { MovieCard };
