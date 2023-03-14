import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'rideFilter'
})
export class RideFilterPipe implements PipeTransform {

  transform(rides: any[], filter: string): any[] {
    if (!rides || !filter) {
      return rides;
    }
    return rides.filter(ride => ride.type === filter);
  }
}