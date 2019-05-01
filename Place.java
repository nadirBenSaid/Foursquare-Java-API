/*
 * Copyright (C) 2019 Bensaid Nadir (Bensaid.nadir@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


public class Place{

	String id;
	Double longitude;
	Double latitude;
	String name;
	String category;

	public Place(String id, Double lon, Double lat, String name, String cat){
		this.id = id;
		this.longitude = lon;
		this.latitude = lat;
		this.name = name;
		this.category = cat;
	}
	
	public void display(){
		System.out.println();
		System.out.print("#"+this.id+" ");
		System.out.print(this.name);
		System.out.print(": ");
		System.out.println(this.category);
		System.out.print(this.latitude);
		System.out.print(" ");
		System.out.println(this.longitude);
		System.out.println();
	}
}