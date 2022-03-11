import { FormCard } from 'components/FormCard';
import { useParams } from 'react-router-dom';

const Form: React.FC = () => {
  // const movie = {
  //   id: 1,
  //   image:
  //     'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/jBJWaqoSCiARWtfV0GlqHrcdidd.jpg',
  //   title: 'The Witcher',
  //   count: 2,
  //   score: 4.5
  // };

  const params = useParams();

  return <FormCard movieId={`${params.movieId}`} />;
};

export { Form };
