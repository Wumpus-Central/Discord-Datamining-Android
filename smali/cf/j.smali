.class public final synthetic Lcf/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcf/k;


# direct methods
.method public synthetic constructor <init>(Lcf/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcf/j;->k:Lcf/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcf/j;->k:Lcf/k;

    invoke-static {v0}, Lcf/k;->K0(Lcf/k;)V

    return-void
.end method
