// import { FaStar } from 'react-icons/fa';
import { MovieStars } from 'components/MovieStars';

import './styles.css';

type MovieScoreProps = {
  score: number;
  count: number;
};
const MovieScore: React.FC<MovieScoreProps> = ({ score, count }) => {
  return (
    <div className='dsmovie-score-container'>
      <p className='dsmovie-score-value'>
        {score > 0 ? score.toFixed(1) : '-'}
      </p>
      <MovieStars />
      {/* <FaStar /> */}
      {/* <MovieStars /> */}
      <p className='dsmovie-score-count'>{count} avaliações</p>
    </div>
  );
};

export { MovieScore };
