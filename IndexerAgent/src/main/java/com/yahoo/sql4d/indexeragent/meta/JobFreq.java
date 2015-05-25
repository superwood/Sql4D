/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.yahoo.sql4d.indexeragent.meta;

/**
 * 
 * @author srikalyan
 */
public enum JobFreq {
    minute,fifteen_minute,thirty_minute,hour,day;
    
    public int inMinutes() {
        int mins = 0;
        switch(this) {
            case minute:
                mins = 1;
                break;
            case fifteen_minute:
                mins = 15;
                break;
            case thirty_minute:
                mins = 30;
                break;
            case hour:
                mins = 60;
                break;
            case day:
                mins = 1440;
                break;
        }
        return mins;
    }
    
    public int inMillis() {
        return inMinutes() * 60 * 1000;
    }
}