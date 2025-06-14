import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterFlats'
})
export class FilterFlatsPipe implements PipeTransform {
  transform(flats: any[] | null | undefined, searchTerm: string): any[] {
    if (!flats) return [];

    if (!searchTerm) return flats;

    const term = searchTerm.toLowerCase();

    return flats.filter(flat =>
      flat.unit?.toLowerCase().includes(term) ||
      flat.apartment?.toLowerCase().includes(term) ||
      flat.configuration?.toLowerCase().includes(term) ||
      flat.currentstatus?.toLowerCase().includes(term)
    );
  }
}
