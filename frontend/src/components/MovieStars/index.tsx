import { FaStar, FaStarHalfAlt, FaRegStar } from 'react-icons/fa';
// import { ReactComponent as StarFull } from 'assets/img/starFull.svg';
// import { ReactComponent as StarHalf } from 'assets/img/starHalf.svg';
// import { ReactComponent as StarEmpty } from 'assets/img/starEmpty.svg';
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
