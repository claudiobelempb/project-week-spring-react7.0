import { FaStar, FaStarHalfAlt, FaRegStar } from 'react-icons/fa';
import './styles.css';

const MovieStars: React.FC = () => {
  return (
    <div className='dsmovie-stars-container'>
      <FaStar />
      <FaStar />
      <FaStar />
      <FaStarHalfAlt />
      <FaRegStar />
      {/* <StarFull />
      <StarFull />
      <StarFull />
      <StarHalf />
      <StarEmpty /> */}
    </div>
  );
};

export { MovieStars };
