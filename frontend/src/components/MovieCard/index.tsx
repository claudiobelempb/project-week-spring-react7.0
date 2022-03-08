import './styles.css';

import { MovieScore } from 'components/MovieScore';

const MovieCard: React.FC = () => {
  const movie = {
    id: 1,
    image:
      'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg',
    title: 'The Witcher',
    count: 2,
    score: 4.5
  };

  return (
    <div className='dsmovie-movie-card-container'>
      <img
        className='dsmovie-movie-card-image'
        src={movie.image}
        alt={movie.title}
      />
      <div className='dsmovie-card-bottom-container'>
        <h3>{movie.title}</h3>
        <MovieScore score={movie.score} count={movie.count} />
        <div className='btn btn-primary dsmovie-btn'>Avaliar</div>
      </div>
    </div>
  );
};

export { MovieCard };
