import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CampaignComponent } from './feature/campaign/campaign.component';
import { ProductComponent } from './feature/product/product.component';
import { OpportunityComponent } from './feature/opportunity/opportunity.component';
import { ProspectComponent } from './feature/prospect/prospect.component';

const routes: Routes = [
  {path: 'campaign', component:CampaignComponent},
  {path: 'product' , component:ProductComponent},
  {path: 'opportunity' , component:OpportunityComponent},
  {path: 'prospect' , component:ProspectComponent},
  {path: 'prospect/:prospect_id', component:ProspectComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
