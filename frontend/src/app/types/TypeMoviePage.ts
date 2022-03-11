import { TypeMovie } from './TypeMovie';

export type TypeMoviePage = {
  content: TypeMovie[];
  last: boolean;
  totalPages: number;
  totalElements: number;
  size: number;
  number: number;
  first: boolean;
  numberOfElements: number;
  empty: boolean;
};
