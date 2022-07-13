import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OpportunityComponent } from './feature/opportunity/opportunity.component';
import { CampaignComponent } from './feature/campaign/campaign.component';
import { ProspectComponent } from './feature/prospect/prospect.component';
import { ProductComponent } from './feature/product/product.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    OpportunityComponent,
    CampaignComponent,
    ProspectComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
