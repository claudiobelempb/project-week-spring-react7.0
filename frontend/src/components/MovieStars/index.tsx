import { FaStar, FaStarHalfAlt, FaRegStar } from 'react-icons/fa';
// import { ReactComponent as StarFull } from 'assets/img/starFull.svg';
// import { ReactComponent as StarHalf } from 'assets/img/starHalf.svg';
// import { ReactComponent as StarEmpty } from 'assets/img/starEmpty.svg';
import './styles.css';

type ScoreProps = {
  score: number;
};

type FillProps = {
  fill: number;
};

const Star: React.FC<FillProps> = ({ fill }: FillProps) => {
  switch (fill) {
    case 0:
      return <FaRegStar />;
    case 1:
      return <FaStar />;

    default:
      return <FaStarHalfAlt />;
  }
};

const MovieStars: React.FC<ScoreProps> = ({ score }) => {
  // EX:
  // getFills(3.5) => [1, 1, 1, 0.5, 0]
  // getFills(4.1) => [1, 1, 1, 1, 0.5]
  function getFills(score: number) {
    const fills = [0, 0, 0, 0, 0];

    const integerPart = Math.floor(score);

    for (let i = 0; i < integerPart; i++) {
      fills[i] = 1;
    }

    const diff = score - integerPart;
    if (diff > 0) {
      fills[integerPart] = 0.5;
    }

    return fills;
  }

  const fills = getFills(score);

  return (
    <div className='dsmovie-stars-container'>
      <Star fill={fills[0]} />
      <Star fill={fills[1]} />
      <Star fill={fills[2]} />
      <Star fill={fills[3]} />
      <Star fill={fills[4]} />
      {/* <StarFull />
      <StarFull />
      <StarFull />
      <StarHalf />
      <StarEmpty /> */}
    </div>
  );
};

export { MovieStars };
